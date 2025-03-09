/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    var sum1 = 0;
    var p = 0;
    var x = parseInt(a);
    var sum2 = 0;
    var q = 0;
    var y = parseInt(b);
    while(x>=0 && y>=0){
        let r = x%10;        
        sum1 = sum1 + r*(2**p);        
        x = Math.floor(x/10);        
        p++;    
        let r2 = y%10;
        sum2 = sum2 + r2*(2**q);        
        y = Math.floor(y/10);
        q++;    
    }   
    
    var sum3 = sum1+sum2;    

    var d = [];
    while(sum3>=0){
        let r = sum3%2;
        d.push(r.toString());
        sum3 = Math.floor(sum3/2);
    }
    // console.log(d);
    var s = "";
    for(let i = d.length-1; i>=0; i--){
        s = s + d[i];
    }
    console.log(s.toString());
    return s.toString();
};


// this one works but time limit exceeded

class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int i = 0;
        int carry = 0;
        
        StringBuilder s = new StringBuilder();
        while(i<alen || i<blen || carry > 0 ){
            int x = 0;
            int y = 0;
            if(i<alen && a.charAt(alen-1-i) == '1'){
                x = 1;
            }
            if(i<blen && b.charAt(blen-1-i) == '1'){
                y = 1;
            }
            s.append((x + y + carry) % 2);
            carry = (x+y+carry)/2;
            i++;
        }
        return s.reverse().toString();
    }
}
