#(loop [c %] (if (> (count c) 1) (if (not= (first c) (last c)) false (recur (reverse (rest (reverse (rest c)))))) true))
