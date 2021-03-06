import React from 'react' ;
import { SubNavItem } from './SubNavItem/SubNavItem';
import styles from './SubNav.module.css' 

export function SubNav() {
    return(
        <div className={styles.container}>
            <div className={styles['sub-nav']}>
                <div>
                    <SubNavItem label='Restaurant' icon='fas fa-utensils' text='Restaurant placeholder text'/>
                    <SubNavItem label='Mall' icon='fas fa-shopping-bag' text='Mall placeholder text'/>
                    <SubNavItem label='Beach' icon='fa-umbrella-beach' text='Beach placeholder text'/>
                    <SubNavItem label='More' icon='fas fa-info-circle' showRightBorder text='More Options placeholder text'/>
                </div>
                <div>
                    <button className={`button ${styles['subnav-button']} ${styles['omit-right-border']}`}>
                        <span className="icon"><i class="fas fa-pen"/></span>
                        <span>Write a Review</span>
                    </button>
                    <button className={`button ${styles['subnav-button']}`}>
                        <span className="icon"><i class="fas fa-hotel"/></span>
                        <span>For Businesses</span>
                    </button>
                </div>
            </div>
        </div>
        
    );
}