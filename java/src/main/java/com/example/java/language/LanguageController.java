/*
 * @author Qi Fenglong (qifenglong@artron.net)
 *
 * CreatAt: 2019/7/17 Time: 上午11:27
 *
 * Copyright (c) 2000-2019. http://www.artron.net. All rights reserved.
 *
 * Use of this source code is governed a license that can be found in the LICENSE file.
 *
 */

package com.example.java.language;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LanguageController {

    @RequestMapping("/")
    Language index() {
        return new Language("java");
    }
}
