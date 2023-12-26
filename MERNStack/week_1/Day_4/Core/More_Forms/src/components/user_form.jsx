import React, { useState } from "react";
const userForm = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const createUser = (e) => {
        e.preventdefult();
        const newUser = { firstName, lastName, email, password, confirmPassword}
        if(value.length < 3){
            setFirstName("hgfjytjy");
        }else{
            setFirstName("")
        }
        setLastName("");
        setEmail("");
        setPassword("");
        setConfirmPassword("");
    }
    return (
        <div>
        <form>
            <div>
                <label>First Name: </label>
                <input type="text" value={firstName} onChange={(e) => setFirstName(e.target.value)} />
                {firstName.length<2?<p style={{color:"red"}}>First Name must be at least 2 characters</p>:<p style={{color:"green"}}>First Name Valid!</p>}
            </div>
            <div>
                <label>Last Name: </label>
                <input type="text" value={lastName} onChange={(e) => setLastName(e.target.value)} />
                {firstName.length<2?<p style={{color:"red"}}>Last Name must be at least 2 characters</p>:<p style={{color:"green"}}>Last Name Valid!</p>}
            </div>
            <div>
                <label>Email Address: </label>
                <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} />
                {email.length<2?<p style={{color:"red"}}>Email must be at least 2 characters</p>:<p style={{color:"green"}}>Email Valid!</p>}
            </div>
            <div>
                <label>Password: </label>
                <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
                {password.length<8?<p style={{color:"red"}}>Password must be at least 8 characters</p>:<p style={{color:"green"}}>Password Valid!</p>}
            </div>
            <div>
                <label>Confirm Password: </label>
                <input type="password" value={confirmPassword} onChange={(e) => setConfirmPassword(e.target.value)} />
                {confirmPassword != password?<p style={{color:"red"}}>Passwords must much</p>:<p style={{color:"green"}}>Password Valid!</p>}
            </div>
            <input type="submit" value="Create User" />
        </form>
        <h2>Your Form Data</h2>
        <div onSubmit={createUser}>
        <p>First Name: {firstName}</p>
        <p>Last Name: {lastName}</p>
        <p>Email: {email}</p>
        <p>Password: {password}</p>
        <p>Confirm Password: {confirmPassword}</p>
      </div>
        </div>
    )
}




export default userForm;