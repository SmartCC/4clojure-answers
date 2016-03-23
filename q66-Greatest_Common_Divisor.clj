(fn g [a b] (if (== 0 (mod a b)) b (g b (mod a b))))
