#(loop [x % y %2 res []]
        (if (or (nil? x) (nil? y))
          res
          (recur (next x) (next y) (conj res (first x) (first y)))))
