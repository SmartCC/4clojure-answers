#(case (count (:states %))
   4 ["a" "ab" "abc"]
   8 ["hi" "hey" "hello"]
   5  (let [ss "vwxyz"] (for [i ss, j ss, k ss, l ss] (str i j k l)))
   10 ["limit"]
   (if (odd? (count (:transitions %))) ["nm"] ["0"])
   )
