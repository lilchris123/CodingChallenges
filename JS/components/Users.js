import React from "react";

const Users = (props) => {
  const { users } = props;
  return (
    <div>
      {users?.map((user,idx) => (
        <div key={idx}>
          <p>{user.name.first}</p>
          <p>{user.name.last}</p>
        </div>
      ))}
    </div>
  );
};

export default Users;
