import React,{useEffect,useState} from 'react';
import "./ProgressBar.css";

const ProgressBar = (props) =>{
    let bar ={
        width: `${props.progress}%`,
        height: "100px",
        transition: "width 2s ease-in"
    };

    let [isLoaded,setIsLoaded]= useState(false);

    useEffect(()=>{
        setIsLoaded(true);
    },[]);
    return(<div className="container">
        <progress style={isLoaded ? bar: {}} className={isLoaded? "":"noBar"}></progress>
    </div>);
}
export default ProgressBar;