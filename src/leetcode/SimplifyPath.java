package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 71. 简化路径 以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。
 * 
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点
 * （..） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径
 * 
 * 请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）不能以 /
 * 结尾。此外，规范路径必须是表示绝对路径的最短字符串。
 * 
 * @author huangzhebin
 *
 */
public class SimplifyPath {

	public String simplifyPath(String path) {

		List<String> ret = new ArrayList();
		String[] ps = path.split("/");

		for (int i = 0; i < ps.length; i++) {
			if (ps[i].equals("..")) {
				if (ret.size() >= 1)
					ret.remove(ret.size() - 1);

			} else if (!ps[i].equals(".") && !ps[i].equals("")) {
				ret.add(ps[i]);
			}
		}
		StringBuilder s = new StringBuilder();
		for (String p : ret) {
			s.append("/" + p);
		}
		if (s.length() == 0)
			s.append("/");
		return s.toString();

	}

}
