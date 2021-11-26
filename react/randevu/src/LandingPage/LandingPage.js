import React from 'react';
import { TopNav } from './TopNav/TopNav';
import RandevuLogo from '../assets/RandevuLogo.png';
import styles from './LandingPage.module.css';
import { SearchBar } from '../SearchBar/SearchBar';
import { SearchSuggestions } from './SearchSuggestions/SearchSuggestions';

export function LandingPage() {
    return (
        <div className={styles.landing}>
            <div className={styles['search-area']}>
                <TopNav/>
                <img src={RandevuLogo} className={styles.logo} alt='logo'/>
                <SearchBar/>
                <SearchSuggestions/>
            </div>
        </div>

    );
}