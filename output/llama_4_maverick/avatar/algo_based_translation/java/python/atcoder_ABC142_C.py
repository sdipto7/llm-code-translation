
def main():
    N = int(input())
    idorder = {}
    for i in range(1, N + 1):
        A = int(input().split()[0]) if i == 1 else int(input().split()[i-1]) 
    # the above line will not work as expected if input is not in the correct format.
    # Instead, we should read the entire line and then split it into numbers.
    A_list = list(map(int, input().split()))
    for i, A in enumerate(A_list, start=1):
        idorder[A] = i
    for i in range(1, N + 1):
        print(idorder[i], end=' ')

if __name__ == "__main__":
    main()
 
However, a more accurate representation would be 


N = int(input())
idorder = {}
A_list = list(map(int, input().split()))
for i, A in enumerate(A_list, start=1):
    idorder[A] = i
for i in range(1, N + 1):
    print(idorder[i], end=' ')

