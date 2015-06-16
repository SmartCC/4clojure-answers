(fn [n f c] 
  (take 
   (nth 
    (keep-indexed #(if (f %2) % nil) c) 
    (dec n)) 
   c))
