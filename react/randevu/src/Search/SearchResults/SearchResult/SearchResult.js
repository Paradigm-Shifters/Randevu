import React from 'react';
import { BusinessRating } from '../../../BusinessRating/BusinessRating';
import styles from './SearchResult.module.css';

export function SearchResult() {
    return (
        <div className={styles['search-result']}>
            <img src='https://via.placeholder.com/210' alt='business' className={styles['business-image']} />
            <div className={styles['business-info']}>
                <h2 className="subtitle">Burger Place</h2>
                <BusinessRating/>
                <p>$$ <span className="tag">Burgers</span> <span className="tag">Fast Food</span></p>
            </div>
            <div className={styles['contact-info']}>
                <p>(381) 534-2874</p>
                <p>Main Road Street</p>
                <p>982174 California</p>
            </div>
        </div>
    );
}