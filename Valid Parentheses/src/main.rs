fn is_valid(s : String)->bool {
    let mut stack: Vec<char> = vec![];
    let mut which_parenthses:Vec<i32> = vec![];
    for char in s.chars() {
        match char {
            '(' => {
                stack.push(char);
                which_parenthses.push(1);
            },
            '{' => {
                stack.push(char);
                which_parenthses.push(2);
            },
            '[' => {
                stack.push(char);
                which_parenthses.push(3);
            },
            '}' => {
                if (which_parenthses.pop().unwrap_or(0) == 2) {
                    stack.pop();
                } else {
                    return false
                }
            },
            ')' => {
                if (which_parenthses.pop().unwrap_or(0) == 1) {
                    stack.pop();
                } else {
                    return false
                }
            },
            ']' => {
                if (which_parenthses.pop().unwrap_or(0) == 3) {
                    stack.pop();
                } else {
                    return false
                }
            },
            _ => ()
        }
    }
    stack.is_empty()
    }
fn main(){
    let is_valid = isValid(String::from("{[]}"));
    println!("is valid : {:?}",is_valid);
    println!("Helloc world!");
}