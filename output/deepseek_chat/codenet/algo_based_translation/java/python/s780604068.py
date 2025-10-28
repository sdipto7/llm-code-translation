def main():
    N = int(input())
    map_arr = []
    for _ in range(N * 2):
        map_arr.append(int(input()))
    
    map_arr.sort()
    
    max_val = 0
    for i in range(0, N * 2, 2):
        max_val += min(map_arr[i], map_arr[i + 1])
    
    print(max_val)

if __name__ == "__main__":
    main()
