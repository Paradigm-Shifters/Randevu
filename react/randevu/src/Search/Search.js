import React from 'react';
import { NavBar } from '../NavBar/NavBar';
import { SubNav } from '../NavBar/SubNav/SubNav';
import { SearchResults } from './SearchResults/SearchResults';
import { SearchResultsSummary } from './SearchResultsSummary/SearchResultsSummary';
import { useParams } from 'react-router-dom';

export function Search() {

    const {term, location} = useParams();

    return (
        <div>
            <NavBar term={term} location={location} />
            <SubNav/>
            <SearchResultsSummary term={term} location={location} />
            <SearchResults/>
        </div>
    );
} 