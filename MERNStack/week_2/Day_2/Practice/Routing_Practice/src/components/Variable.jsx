import React from 'react';
import { useParams } from 'react-router-dom';

function Word() {
    const {variable, color1, color2} = useParams()
    const isNumeric = isNaN(variable);
    const headingStyle = {
            backgroundColor: color2,
            color: color1,
        };
    

    return (
        <>
            {isNumeric ? (
                <h1 style={headingStyle}>The word is: {variable}</h1>
                ) : (
                <h1>The number is: {variable}</h1>
            )}
        </>
    );
}
export default Word;

