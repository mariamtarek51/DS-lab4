# Perfect Hashing 
implementation of a perfect hash table in O(N) and O(n^2) Space Solution.

* O(N^2) space solution: 

we are willing to have a table whose size is quadratic in the size No four dictionaryS. Then,here is an easy method.Let H  be universal and M=N^2.
Pick a random h from Hand try it out, hashing everything in S.So,we just try it,and if we got any collisions ,we just try a new
h.On average,we will only need to do this twice.

* O(N) space solution:

The main idea for this method is to use universal hash functions in a 2-level scheme.
The method is as follows.We will first hash into a table of size N using universalhashing. This will produce some collisions.However, we will then rehash 
each bin using Method1, squaring the size of the bin to get zero collisions.So,the way to think of this scheme is that we have a first-level hashfunction hand
first-level tableA, and then N second-level hash functions h1,...,hN and Nsecond-level tables A1,...,AN. 
To lookup an element x,we first compute i=h(x) and then find the element in Ai[hi(x)].
