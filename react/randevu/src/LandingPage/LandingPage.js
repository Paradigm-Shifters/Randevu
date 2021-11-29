import React from 'react';
import { TopNav } from './TopNav/TopNav';
import RandevuLogo from '../assets/RandevuLogo.png';
import styles from './LandingPage.module.css';
import { SearchBar } from '../SearchBar/SearchBar';
import { SearchSuggestions } from './SearchSuggestions/SearchSuggestions';
import { useHistory } from 'react-router-dom';

export const LandingPage = () => {

    let history = useHistory();

    function search(term, location) {
        const urlEncodedTerm = encodeURI(term);
        const urlEncodedLocation = encodeURI(location);
        history.push(`/search/${urlEncodedTerm}/${urlEncodedLocation}`);
    }

    return (
        <div className={styles.landing}>
            <div className={styles['search-area']}>
                <TopNav/>
                <img src={RandevuLogo} className={styles.logo} alt='logo'/>
                <SearchBar search={search} />
                <SearchSuggestions/>
            </div>
        </div>

    );
}