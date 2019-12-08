#lang racket

;Please use "next" and "hasNext" for input after run the code



(define (iter list)
  (decide (read) (sort  list string<?)))
  
   
(define (hasNext list);Check the list is empty or not, if empty then means not have next item.
  (if (> (length list) 0 )
      1
      0))

(define (next list);next function return first item in list
  (if (null? list)
      -1
      (car list)))

(define (decide input list)
  (cond ((eq? input 'next);if input is "next" then run the next invoke next function
         (begin
           (display (next list)); if has not next return -1
           (if (= (hasNext list) 1)
               (iter (cdr list))
                (display 'empty))))
        ((eq? input 'hasNext);if input is "hasNext" then run the next invoke hasNext function
         (begin
           (display (hasNext list)); if has not next return 0
           (if (= (hasNext list) 1)
               (iter list)
              (display 'empty))))
      (else 0)))
  



(iter '("dd" "cc" "aa" "ab" "aac")) 