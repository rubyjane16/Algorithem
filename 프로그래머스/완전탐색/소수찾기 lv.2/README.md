# <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42839">소수찾기</a>

### 문제 설명
<p>한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다. 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.</p>

### 제한사항
<li>numbers는 길이 1 이상 7 이하인 문자열입니다.</li>
<li>numbers는 0~9까지 숫자만으로 이루어져 있습니다.</li>
<li>"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.</li>

### 입출력 예
<table>
<th>numbers	</th>
<th>return</th>
  <tr>
<td>"17"</td>	
  <td>3</td>
</tr>
  <tr>
<td>"011"</td>	
    <td>2</td>
  </tr>
</table>

### 입출력 예 설명
<p>
<ul>
예제 #1
<li>[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.</li>
<br>
예제 #2
<li>[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.</li>

11과 011은 같은 숫자로 취급합니다.
</ul>
</p>
  
### 문제 해결 과정
<p>
<ol>
<li>재귀 함수로 모든 숫자의 조합을 찾는다.</li>
<li>에라토스테네스의 체의 limit으로 소수인지 아닌지 확인하는 isPrime함수를 구현하여 소수의 갯수를 센다.</li>
<li>소수의 갯수를 반환한다.</li>
</ol>

-substring(startIndex,lastIndex); // startIndex부터 lastIndex "전"까지의 문자열을 잘라서 리턴합니다. <br>
-iterator를 활용하면 다양한 자료구조에서 공통적으로 사용할 수 있다는 장점이 있다. (hasNext, next, remove로 사용한다.)
</p>
