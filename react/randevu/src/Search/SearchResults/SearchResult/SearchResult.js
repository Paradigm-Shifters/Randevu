import React from 'react';
import { BusinessRating } from '../../../BusinessRating/BusinessRating';
import styles from './SearchResult.module.css';

export function SearchResult(props) {
    const b = props.business; 
    //console.log(props.business);
    if (!b) {
        //console.log('inside result');
        return (<div/>);
    }

    //console.log('before');
    const tags = b.categories.map(category => (<span className={`tag ${styles['business-tag']}`} key={b.id + category.title}>{category.title} </span>));
    const addressLines = b.location.display_address.map(addressLine => <p key={b.id + addressLine}>{addressLine}</p>);
    const yelp_url = b.url;
    let deliveryAndPickup = '';
    if ( b.transactions.includes('delivery') && !b.transactions.includes('pickup')) {
        deliveryAndPickup = 'We deliver!';
    } else if ( !b.transactions.includes('delivery') && b.transactions.includes('pickup')) {
        deliveryAndPickup = 'Pickup only!';
    } else if ( b.transactions.includes('delivery') && b.transactions.includes('pickup')) {
        deliveryAndPickup = 'Delivery & Pickup available!'
    }

    let calendarLink = 'https://calendar.google.com/calendar/render?action=TEMPLATE&text=Visit%20' 
            + b.name + '&dates=today&details=' + b.alias + '<br />Invite%20some%20friends!' +
            '&location=' + b.location.address1 + '%20' + b.location.address2 + '%20' + b.location.city + '%20' + b.location.zip_code;

    let mapsLink = 'https://www.google.com/maps/dir/?api=1&travelmode=driving&layer=traffic&destination='
            + b.coordinates.latitude + ',' + b.coordinates.longitude;
    
    //console.log(yelp_url);

    return (
        <div className={styles['search-result']}>
            <a href={yelp_url} target='_blank' rel='noreferrer'>
                <img src={b.image_url} alt='business' className={styles['business-image']} />
            </a>
            <div className={styles['business-info']}>
                <a href={yelp_url} target='_blank' rel='noreferrer'>
                    <h2 className="subtitle">{b.name}</h2>
                </a>
                <br></br>
                <BusinessRating reviewCount={b.review_count} rating = {b.rating}/>
                <p>{b.price} {tags}</p>
                <br></br>
                <p><i>{deliveryAndPickup}</i></p>
                <br></br>
                
                <a href={calendarLink} target="_blank" rel="noreferrer">
                    <button className='button is-small'>
                        <span className="icon"><i className="far fa-calendar-plus"></i></span>
                        <span>Plan an event!</span>
                    </button>
                </a>

            </div>
            <div className={styles['contact-info']}>
                <p>{b.display_phone}</p>
                {addressLines}
                <br></br>
                <a href={mapsLink} target="_blank" rel="noreferrer">
                    <button className='button is-small'>
                        <span className="icon"><i className="fas fa-map-marker-alt"></i></span>
                        <span>How do I get here?</span>
                    </button>
                </a>
            </div>
        </div>
    );
}