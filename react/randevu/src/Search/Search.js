import React from 'react';
import { NavBar } from '../NavBar/NavBar';
import { SubNav } from '../NavBar/SubNav/SubNav';
import { SearchResults } from './SearchResults/SearchResults';
import { SearchResultsSummary } from './SearchResultsSummary/SearchResultsSummary';
import { useParams, useHistory } from 'react-router-dom';
import { useBusinessSearch } from '../hooks/yelp-api/useBusinessSearch';

export function Search() {

    const {term, location} = useParams();
    let history = useHistory();
    const [businesses, amountResults, searchParams, performSearch] = useBusinessSearch(term, location);
    //console.log(businesses);
    
    if (!term || !location) {
        history.push('/');
    }

    function search(term, location) {
        const encodedTerm = encodeURI(term);
        const encodedLocation = encodeURI(location);
        history.push(`/search/${encodedTerm}/${encodedLocation}`);
        performSearch({term, location});
    }
    
    return (
        <div>
            <NavBar term={term} location={location} search={search}/>
            <SubNav/>
            <SearchResultsSummary term={searchParams.term} 
                                  location={searchParams.location} 
                                  amountResults={amountResults} 
                                  shownResults={businesses ? businesses.length : 0} 
            />
            <SearchResults businesses={businesses}/>
        </div>
    );
} 