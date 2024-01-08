import React, { useEffect, useState } from 'react'
import axios from "axios"
import { Link } from "react-router-dom";

const HomePage = () => {

    const [products,setProducts]=useState([])

    const DeleteProduct=(id)=>{
        axios
        .delete(`http://localhost:8000/api/Products/${id}`)
        .then((res)=>{console.log(res)
        const filtered= products.filter((eachProduct)=>{
            return eachProduct._id !==	id;
        });
        setProducts(filtered);
    })
        .catch((err)=>console.log(err));

    }

    useEffect(()=>{
        axios
        .get("http://localhost:8000/api/products")
        .then((allProducts)=>{setProducts(allProducts.data)})
        .catch((err)=>{console.log(err)})
    },[]);
return (
    <div>
        { products.map((OneProduct)=>{
            return(
    
            <div key={OneProduct._id}>
        <Link to={`/Product/${OneProduct._id}`}>
            <h2>{OneProduct.title}</h2>
        </Link>
            <h2>{OneProduct.price}</h2>
            <h2>{OneProduct.description}</h2>
            <Link to={`/Product/${OneProduct._id}/update`}>Update</Link>
            <button onClick={()=>{DeleteProduct(OneProduct._id)}}>Delete</button>
            </div>
    
            )
            
            
        })}
    </div>
)
}

export default HomePage