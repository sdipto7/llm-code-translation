
import sys

def main():
    info = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]
    
    import sys
    import fileinput
    
    input_lines = list(fileinput.input())
    n = int(input_lines[0].strip())
    
    index = 1
    for _ in range(n):
        built, floor, room, num = map(int, input_lines[index].strip().split())
        info[built - 1][floor - 1][room - 1] += num
        index += 1
    
    for i in range(4):
        for j in range(3):
            for k in range(10):
                print(info[i][j][k], end=' ')
            print()
        if i != 3:
            print("####################")

if __name__ == "__main__":
    main()

