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
                <div>
                    <img src={RandevuLogo} className={styles.logo} alt='logo'/>
                </div>
                <SearchBar search={search} />
                <SearchSuggestions/>
                <br></br>
                <a href='https://cors-anywhere.herokuapp.com/corsdemo' target='_blank' rel='noreferrer' back>
                    <button className='button is-large'>
                        <span>Enable API Calls</span>
                    </button>
                </a>
                <br></br>
                <span><b>In order to enable API calls, you must click this button and then the button you are redirected to.</b></span>
            </div>
        </div>

    );
}