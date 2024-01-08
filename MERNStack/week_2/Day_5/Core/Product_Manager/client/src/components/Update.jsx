import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const Update = () => {
    const {id}= useParams();

    const [title,setTitle]= useState("")
    const[price,setPrice]= useState("")
    const[description,setDescription]= useState("")

    const navigate = useNavigate();

    useEffect(()=>{
        axios
        .get(`http://localhost:8000/api/products/${id}`)
        .then((res)=>{
            setTitle(res.data.title);
            setPrice(res.data.price);
            setDescription(res.data.description);
        })
        .catch((err)=>console.log(err))

    },[id])

    const submitHandler =(e)=>{

        e.preventDefault();

        const updateProduct={
            title,
            price,
            description,
        };
        axios
        .patch("http://localhost:8000/api/products/" + id, updateProduct)
        .then((res)=>{navigate("/")})
        .catch((err)=>console.log(err));

        setTitle("")
        setPrice("")
        setDescription("")
    };

return (
    <div>
    <form  onSubmit={submitHandler}>
        <div>
            <label >Title</label>
            <input type="text" onChange={(e)=>setTitle(e.target.value)} value={title}/>
        </div>
        <div>
            <label > Price</label>
            <input type="number" onChange={(e)=>{setPrice(e.target.value)}} value={price}/>
        </div>
        <div>
            <label >Description</label>
            <input type="text"  onChange={(e)=>{setDescription(e.target.value)}} value={description}/>
        </div>
        <button>Update</button>
    </form>
    
        </div>
)
}

export default Update