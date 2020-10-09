import React from 'react';
import bubbleSort from "../sortingAlgoritms/bubbleSort";

const BubbleSort = (props) => {
  return <>
    <h2>Bubble Sort</h2>
      <div style={{marginLeft: "1rem"}}>
        <h4>Unsorted array</h4>
        <div>{props.arr.toString()}</div>
        <h4>Sorted array</h4>
        <div>{bubbleSort(props.arr).toString()}</div>
      </div>
  </>;
};

export default BubbleSort;
