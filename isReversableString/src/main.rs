use std::cmp::Ordering;

pub fn is_palindrome(s: String) -> bool {
    let mut chars_stack : Vec<u8> = Vec::new();
    let mut length = 0;
    for char in s.to_ascii_lowercase().bytes() {
        if char < 123 && char > 96 || char < 58 && char > 47 {
            chars_stack.push(char);
            length += 1;
        }
    }
    let iter_length = length/2;
    let mut i = 0;
    let mut isMirrored = true;

    while i != iter_length {
        if chars_stack[i] != chars_stack[length-i-1] {
            isMirrored = false;
            break;
        }
        i+=1;
    }




    isMirrored
    }

fn main() {
    let istruee = is_palindrome(String::from("iki"));
    println!("{istruee}");
    println!("Hello, world!");
}
