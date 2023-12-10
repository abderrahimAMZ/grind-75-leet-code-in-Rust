#[derive(PartialEq, Eq, Clone, Debug)]
 pub struct ListNode {
   pub val: i32,
   pub next: Option<Box<ListNode>>
 }


 impl ListNode {
   #[inline]
   fn new(val: i32) -> Self {
     ListNode {
       next: None,
       val
     }
   }
 }



    pub fn merge_two_lists(list1: Option<Box<ListNode>>, list2: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        match (list1,list2) {
            (None,None) => None,
            (Some(l1),None) => Some(l1),
            (None,Some(l2)) => Some(l2),
            (Some(l1),Some(l2)) => {
                if (l1.val <= l2.val) {
                   Some(Box::new(ListNode {
                       val : l1.val,
                       next : merge_two_lists(
                           l1.next,
                           Some(l2)
                       )
                   }))
                }
                else  {
                   Some(Box::new(ListNode {
                       val : l2.val,
                       next : merge_two_lists(
                           Some(l1),
                                l2.next
                       )
                   }))
                }
            }
        }
    }



 fn main() {
     let mut list1 = Some(Box::new(ListNode { val : 1, next : Some(Box::new(ListNode { val : 4, next : Some(Box::new(ListNode { val : 6, next : Some(Box::new(ListNode { val : 8, next : None}))}))}))}));
     let mut list2 = Some(Box::new(ListNode { val : 2, next : Some(Box::new(ListNode { val : 3, next : Some(Box::new(ListNode { val : 7, next : Some(Box::new(ListNode { val : 9, next : None}))}))}))}));

     let result = merge_two_lists(list1,list2);
     println!("{:?}",result);
}
