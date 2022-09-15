package com.canbe.entity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 文章信息
 * </p>
 *
 * @author cxd
 * @since 2022-08-01
 */
@Data
@Accessors(chain = true) //链式编程
public class BlogInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String blogAuthor;

    private String blogCategory;

    private String blogTags;

    private String blogTitle;

    private String blogContent;

    private String blogStatus;

    private String blogEditType;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private Integer commentNum;

    private Integer readingNum;

    private Integer storeNum;

    private Integer favourNum;

    private String delFlag;

}
