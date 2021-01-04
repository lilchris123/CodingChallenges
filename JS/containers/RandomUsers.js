import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Users from '../components/Users';

const RandomUsers= (props) => {
    const [users, setUsers] = useState([]);
    
    useEffect(() => {
        async function fetchUsers(){
            const results = await axios.get("https://randomuser.me/api/");
            return results?.data?.results;
        } 
        fetchUsers().then(data => setUsers(data)).catch(err => console.log(err));
    },[]);

    return (
        <div>
            <h3>Random Users</h3>
            <div>
                <Users users={users}/>
            </div>
        </div>
    );
}

export default RandomUsers;