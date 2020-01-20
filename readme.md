 
### �������� ���������:
 ����������� ��� ������ �������.
 - `git config --global credential.helper store` 
 - `git config --global alias.`
 - `git config --global http.proxy http://login:pas@proxy:8080`
 - `git log --pretty=format:'%h %ad | %s%d [%an]' --graph --date=short`
 - `git log --graph --all --format=format:'%C(bold blue)%h%C(reset) - %C(bold green)(%ar)%C(reset) %C(white)%s%C(reset) %C(bold white)- %an%C(reset)%C(bold yellow)%d%C(reset)' --abbrev-commit --date=relative`
 - [��� ������� �������� ������](https://tproger.ru/translations/most-common-git-screwupsquestions-and-solutions/amp/)
 - [���������](https://habr.com/post/125999/)
 
## ��� ������ ��������
 
 0. ����� �� GitHub
 1. ������� ����������� <https://github.com/frozzen256/BPA17-01> (�������� ����������� ������������)
 2. ������� ���� `Fork` ����� �����������
 3. ��������� ��������� ���� ���� �� ���������
 4. ������� � ���� �������� `origin`
 5. ������� �������� `upstream` � ������������� ����������� 
 6. ������� ����� ����� ��� ��������� `devlp` 
 7. ���������� ��������� � ��������� `commit`
 8. ��������� ��������� ����� � ���� ����������� 
 9. ����� � ���� ����������� �� GitHub � ��������� ������ (Pull Request) �� �������� ��������� � �������� ����������� ������������ � ����� devlp

#### ���� �������:

_��� ������� ��������� ������_
 `git reset --soft HEAD^`
_������� ������ ��������_
 `git reset HEAD~1 --hard`
_� �� ������_
 `git push -f`

