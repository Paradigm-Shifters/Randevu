import React from 'react';
import { Spinner } from '../../Spinner/Spinner';
import { SearchResult } from './SearchResult/SearchResult';
import styles from './SearchResults.module.css';

export function SearchResults(props) {
    let searchResults = <Spinner/>;
    if (props.businesses && props.businesses.length) {
        //console.log('nothing yet');
        searchResults = props.businesses.map(b => <SearchResult key={b.id} business={b}/>)
    }

    //console.log(props.businesses);
    return (
        <div className={styles['search-results']}>
            {searchResults}
        </div>
    );
}