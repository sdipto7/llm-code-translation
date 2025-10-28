
def main():
    import sys
    
    info = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]

    input_data = sys.stdin.read().split()
    n = int(input_data[0])
    index = 1
    
    for _ in range(n):
        built = int(input_data[index])
        floor = int(input_data[index + 1])
        room = int(input_data[index + 2])
        num = int(input_data[index + 3])
        index += 4
        info[built - 1][floor - 1][room - 1] += num

    for i in range(4):
        for j in range(3):
            for k in range(10):
                print(f" {info[i][j][k]}", end="")
            print()
        if i != 3:
            print("####################")

if __name__ == "__main__":
    main()

