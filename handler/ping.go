package handler

import (
	"lemon-robot-executor/core"
	"lemon-robot-executor/sysinfo"
	"time"
)

func StartPingHandler() {
	core.WorkLock.Add(1)
	ticker := time.NewTicker(time.Second * time.Duration(sysinfo.LrConfig().TimerPingInterval))
	go func() {
		for range ticker.C {
			core.Ping()
		}
	}()
}
