(fn [x] (
         let [f (first x), s (second x)]
          (zipmap
           '(:suit :rank)
           (conj '() (#(case % \T 8 \J 9 \Q 10 \K 11 \A 12 (- (int %) 50)) s)
                 (#(case % \D :diamond \S :spade \H :heart \C :club) f)))))
