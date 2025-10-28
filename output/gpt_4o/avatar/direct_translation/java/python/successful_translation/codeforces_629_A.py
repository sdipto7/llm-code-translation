
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    num = int(data[0])
    counter = 0
    fine = 0
    arr = data[1:num+1]
    
    for i in range(num):
        for k in range(num):
            if arr[k][i] == 'C':
                counter += 1
        fine += (counter * (counter - 1)) // 2
        counter = 0
    
    for i in range(num):
        for k in range(num):
            if arr[i][k] == 'C':
                counter += 1
        fine += (counter * (counter - 1)) // 2
        counter = 0
    
    print(fine)

main()

