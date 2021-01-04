import React,{useState, useEffect} from 'react';
import InputUser from '../components/InputUser';

const FunctionalInputExample = () => {
    const [user,setUser]= useState('');

    let handleUser=(e)=>{
        setUser(e.target.value);
    }
    //Similar to componentDidMount and componentDidUpdate
    useEffect(()=>{
        document.title= `${user}`;
    },[user]);

    return ( <>
    <InputUser onTextChange={handleUser}/>
    <p>{user}</p>
    </> );
}
 
export default FunctionalInputExample;