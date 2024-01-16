
pub fn flood_fill(image:  Vec<Vec<i32>>, sr: i32, sc: i32, color: i32) -> Vec<Vec<i32>> {
    let mut result = image;
    match result.get(sr as usize) {
        None => result,
        Some(row) => match row.get(sc as usize) {
            None => result,
            Some(&pixel) => {
                if pixel == color {
                   result
                } else {
                    let value = result[sr as usize][sc as usize];
                    result[sr as usize][sc as usize] = color;
                    if  sr > 0 && result[sr as usize - 1][sc as usize] == value {
                        result = flood_fill(result, sr - 1, sc, color);
                    } if sr < result.len() as i32 - 1 && result[sr as usize + 1][sc as usize] == value {
                         result = flood_fill(result, sr + 1, sc, color);
                    }if sc > 0 && result[sr as usize][sc as usize - 1] == value {
                        result = flood_fill(result, sr, sc - 1, color);
                    }if sc < result[0].len() as i32 - 1 && result[sr as usize][sc as usize + 1] == value {
                        result = flood_fill(result, sr, sc + 1, color);
                    }
                    result
                    }
                }
            }
        }
    }

fn main() {
    let image = vec![vec![1,1,1],vec![1,1,0],vec![1,0,1]];
    let sr = 1;
    let sc = 1;
    let color = 2;
    let result = flood_fill(image, sr, sc, color);
    println!("{:?}", result);

    println!("Hello, world!");
}
