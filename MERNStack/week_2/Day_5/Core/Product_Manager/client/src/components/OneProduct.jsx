import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'

const OneProduct = () => {
    const {id} = useParams();
    const [product,setProduct] = useState({})
useEffect(()=>{
    axios
    .get("http://localhost:8000/api/products/"+id)
    .then( (oneProduct)=> setProduct(oneProduct.data))
    .catch(err=>console.log(err))
},[id]);


return (
    <div>
        <h2>{product.title}</h2>
        <h2>{product.price}</h2>
        <h2>{product.description}</h2>
    </div>
)
}

export default OneProduct