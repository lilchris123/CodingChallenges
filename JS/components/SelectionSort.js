import React from 'react';
import selectionSort from '../sortingAlgoritms/selectionSort';

const SelectionSort = (props) => {
    return ( <>
        <h2>Selection Sort</h2>
      <div style={{marginLeft: "1rem"}}>
        <h4>Unsorted array</h4>
        <div>{props.arr.toString()}</div>
        <h4>Sorted array</h4>
        <div>{selectionSort(props.arr).toString()}</div>
      </div>
    </> );
}
 
export default SelectionSort;