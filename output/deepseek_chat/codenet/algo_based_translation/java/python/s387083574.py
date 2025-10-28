
import sys

def main():
    N = int(sys.stdin.readline())
    map_dict = {}
    for i in range(1, N + 1):
        value = int(sys.stdin.readline())
        map_dict[i] = value
    
    sorted_keys = sorted(map_dict.items(), key=lambda x: x[1])
    result_list = [str(item[0]) for item in sorted_keys]
    print(" ".join(result_list))

if __name__ == "__main__":
    main()

