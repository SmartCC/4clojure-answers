#(case (count %)
   8 (if (% #{'a 'b 'c 'd})
       (if (%  #{'a 'b 'c 'D}) #{#{'a 'c} #{'A 'C}} #{#{'B 'D} #{'b 'd}})
       (if (% #{'a 'B 'c 'd}) #{#{'B 'd} #{'b 'D}} #{#{'A 'c} #{'A 'b} #{'B 'C 'd}}))
   2 #{#{'A 'B 'C}}
   6 (if (%  #{'A 'b 'C 'D}) #{#{'a 'B 'c 'd} #{'A 'B 'c 'D} #{'A 'b 'C 'D} #{'a 'b 'c 'D} #{'a 'B 'C 'D} #{'A 'B 'C 'd}} #{#{'a 'c} #{'B 'c}})
   #{#{'a}})
