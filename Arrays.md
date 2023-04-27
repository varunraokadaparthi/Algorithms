new ArrayList<>(Arrays.asList(str)) vs Arrays.asList(str)
new ArrayList<>(Arrays.asList(str)) -> deep copy
Arrays.asList(str) -> order can be changed
https://stackoverflow.com/questions/16748030/difference-between-arrays-aslistarray-and-new-arraylistintegerarrays-aslist

new ArrayList<>(pass collections here)
Ex: new ArrayList<>(map.values()), new ArrayList<>(Arrays.asList(str))

Fill int[] arr
Arrays.fill(arr, 0)

Fill ArrayList<Integer>
new ArrayList<>(Collections.nCopies(26, 0)


