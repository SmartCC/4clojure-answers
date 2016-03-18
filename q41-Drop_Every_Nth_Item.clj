(fn [v nm] (keep-indexed #(if (not= (- nm 1) (mod % nm)) %2) v))
