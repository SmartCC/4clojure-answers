#(filter (complement sequential?)
          (rest (tree-seq sequential? seq %)))
