import React from "react";
import mergeSort from '../sortingAlgoritms/mergeSort';

const MergeSort = (props) => {
  return (
    <div>
      <h2>Merge Sort</h2>
      <div style={{ marginLeft: "1rem" }}>
        <h4>Unsorted array</h4>
        <div>{props.arr.toString()}</div>
        <h4>Sorted array</h4>
        <div>{mergeSort(props.arr).toString()}</div>
      </div>
    </div>
  );
};

export default MergeSort;
