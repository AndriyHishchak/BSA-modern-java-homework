package com.binary_studio.tree_max_depth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DepartmentMaxDepth {

	private DepartmentMaxDepth() {
	}

	public static Integer calculateMaxDepth(Department rootDepartment) {
		if (rootDepartment == null) {
			return 0;
		}
		else if (rootDepartment.subDepartments.size() == 0) {
			return 1;
		}
		else
		{
			List<Integer> depths = new ArrayList<>();
			for (Department subDepartment : rootDepartment.subDepartments) {
				depths.add(calculateMaxDepth(subDepartment));
			}
			return Collections.max(depths) + 1;
		}
	}

}
