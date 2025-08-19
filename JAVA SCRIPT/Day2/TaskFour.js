function getNearestPump(gallonfuel ,miles) {
let newMile = miles + miles;

if(newMile == gallonfuel) {
 return true
}else {
  return false
}
}
console.log(getNearestPump(20, 20));