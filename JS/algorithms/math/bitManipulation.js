function getBit(num, bitPostion) {
  return (num >> bitPostion) & 1;
}

function setBit(num, bitPostion) {
  return num | (1 << bitPostion);
}

function clearBit(num, bitPostion) {
  let mask = ~(1 << bitPostion);

  return num & mask;
}

function updateBit(number, bitPosition, bitValue) {
  // Normalized bit value.
  const bitValueNormalized = bitValue ? 1 : 0;

  // Init clear mask.
  const clearMask = ~(1 << bitPosition);

  // Clear bit value and then set it up to required value.
  return (number & clearMask) | (bitValueNormalized << bitPosition);
}

function isEven(num){
    return (num & 1) === 0;
}

function isPositive(num){
    // Zero is neither a positive nor a negative number.
  if (number === 0) {
    return false;
  }

  // The most significant 32nd bit can be used to determine whether the number is positive.
  return ((number >> 31) & 1) === 0;
}

/*
Number: 4 = 0b0100
Number: 3 = (4 - 1) = 0b0011
4 & 3 = 0b0100 & 0b0011 = 0b0000 <-- Equal to zero, is power of two.

Number: 10 = 0b01010
Number: 9 = (10 - 1) = 0b01001
10 & 9 = 0b01010 & 0b01001 = 0b01000 <-- Not equal to zero, not a power of two.
 */
function isPowerOfTwo(num){
    return (num & (num-1)) == 0;
}

console.log(isPowerOfTwo(5));
