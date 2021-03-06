package com.zzc.intern.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("trainee_learn_rel")
public class TraineeLearnRel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实习生&学习内容id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 实习生编号
     */
    private Integer traineeId;

    /**
     * 学习内容编号
     */
    private Integer learnId;

    /**
     * 学习状态（0，进行中，1，已完成）
     */
    private Integer learnState;

    /**
     * 实习生&学习内容状态（0：不存在，1：存在）
     */
    private String traineeLearnStatus;


}
