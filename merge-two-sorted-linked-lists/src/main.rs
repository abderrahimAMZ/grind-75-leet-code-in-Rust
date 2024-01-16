
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
    let mut result : Option<Box<ListNode>> = Some(Box::new(ListNode::new(0)));
    let mut p_result  = &result;
    let mut result_value;
    while list1 != None && list2 != None {
        if list1 == None {
            let list1 = list1.unwrap().next;
            result_value = list1.unwrap().val;

        }
        else if  list2 == None {
            let list2 = list2.unwrap().next;
            result_value = list2.unwrap().val;

        }

        else if  list1.unwrap().val <= list2.unwrap().val {
            let list1 = list1.unwrap().next;
            result_value = list1.unwrap().val;
        }
        else {
            let list2 = list2.unwrap().next;
            result_value = list2.unwrap().val;
        }
        p_result.unwrap().next = Some(Box::new(ListNode::new(result_value)));

    }
    result.unwrap().next
}


fn main() {
    let mut listnode = ListNode::new(1);
    let mut listnode2 = ListNode::new(4);
    let mut listnode3 = ListNode::new(7);
    listnode.next = Some(Box::new(listnode2));
    listnode2.next = Some(Box::new(listnode3));

    let mut listnode4 = ListNode::new(2);
    let mut listnode5 = ListNode::new(3);
    let mut listnode6 = ListNode::new(5);
    listnode4.next = Some(Box::new(listnode5));
    listnode5.next = Some(Box::new(listnode6));

    let result = merge_two_lists(Some(Box::new(listnode)),Some(Box::new(listnode4)));
    println!("{:?}",result);
    println!("Hello, world!");
}
