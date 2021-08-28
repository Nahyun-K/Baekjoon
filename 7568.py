# 몸무게 x 키 y     덩치 (x, y)
n = int(input())
array = []
for i in range(n):
    array.append(list(map(int, input().split())))

array.sort()
print(array)
count = 0
lst = [[] for i in range(n)]            
for i in range(n - 1):
    if array[i][1] < array[i+1][1]:
        count += 1
    lst[i].append(count)
print(lst)
